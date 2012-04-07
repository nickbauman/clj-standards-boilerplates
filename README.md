# clj-standards-boilerplates

Various standard semi-static information that people often need in a projectexpressed directly in Clojure. Things like:

+ISO codes 
+Coordinates of various postal codes
+???

## Usage

You will need Leiningen.

To use this, add the *lein-git-deps* dependency to your dev-dependencies property in your project.clj. Then add git repo for the HTML parsing library the tests use.

        (defproject yourproject "1.0.0-SNAPSHOT"
          ...
          :dev-dependencies [lein-git-deps "0.0.1-SNAPSHOT"]
          ...
          :git-dependencies [["git@github.com:nickbauman/clj-standards-boilerplates.git"]]
          ...)

Then, run:

        lein deps
        lein git-deps

## License

Copyright (C) 2012 Nick Bauman

Distributed under the Eclipse Public License, the same as Clojure.
