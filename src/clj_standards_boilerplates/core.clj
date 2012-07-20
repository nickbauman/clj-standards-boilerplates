(ns clj-standards-boilerplates.core
  (:use [clojure.string :only [split-lines split]]))

(defn parse-nasdaq-csv
  "Parses NASDAQ daily summary into a map of {\"TICKER\" {:symbol \"TICKER\", :market-cap \"26.8\", :summary-quote \"Industrial Machinery/Components\", :ipo-year \"n/a\", :industry \"Capital Goods\", :name \"MKS Instrument\", :sector \"1999\", :adr-tso \"1407991600\", :last-sale \"Inc.\"}}"
  [path-str]
  (let [lines-list (rest (split-lines (slurp path-str)))
        rhs-map-keys [:symbol :name :last-sale :market-cap :adr-tso :ipo-year :sector :industry :summary-quote]]
    (loop [[first-listing & rest-listings :as all-listings] lines-list
           result {}]
      (if (seq all-listings)
        (recur rest-listings
               (let [map-value (into {} (vec (map vec (partition 2 (interleave rhs-map-keys (map #(apply str (butlast (rest %))) (split first-listing #",")))))))]
               (into result [[(:symbol map-value) map-value]])))
        result))))

(def nasdaq_daily (parse-nasdaq-csv "./src/clj_standards_boilerplates/NASDAQ_DAILY.csv"))

; Writing this to a Clojure namespace file and subseqent loading blows past the JVM's ability to handle code this size.
;
;(with-open [file (clojure.java.io/writer "./src/clj_standards_boilerplates/NSADAQ.clj")]
;  (.write file "(ns clj-standards-boilerplates.NASDAQ.clj)\n\n(def NASDAQ_DAILY \n")
;  (doseq [kkey (keys nasdaq_daily)]
;    (.write file (str "  {\"" kkey "\" " (nasdaq_daily kkey) "}\n")))
;  (.write file ")\n"))