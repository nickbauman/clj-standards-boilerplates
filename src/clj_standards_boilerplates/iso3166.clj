(ns clj-standards-boilerplates.iso3166)

(def countries 
  {"NETHERLANDS ANTILLES"  {:name "NETHERLANDS ANTILLES" :scode "AN" :code "ANT" :id "530"}
   "AUSTRALIA"  {:name "AUSTRALIA" :scode "AU" :code "AUS" :id "036"}
   "CAMBODIA"  {:name "CAMBODIA" :scode "KH" :code "KHM" :id "116"}
   "DOMINICA"  {:name "DOMINICA" :scode "DM" :code "DMA" :id "212"}
   "ISRAEL"  {:name "ISRAEL" :scode "IL" :code "ISR" :id "376"}
   "COTE D'IVOIRE"  {:name "COTE D'IVOIRE" :scode "CI" :code "CIV" :id "384"}
   "MAURITANIA"  {:name "MAURITANIA" :scode "MR" :code "MRT" :id "478"}
   "SLOVENIA"  {:name "SLOVENIA" :scode "SI" :code "SVN" :id "705"}
   "MONACO"  {:name "MONACO" :scode "MC" :code "MCO" :id "492"}
   "ALGERIA"  {:name "ALGERIA" :scode "DZ" :code "DZA" :id "012"}
   "PHILIPPINES"  {:name "PHILIPPINES" :scode "PH" :code "PHL" :id "608"}
   "NEW ZEALAND"  {:name "NEW ZEALAND" :scode "NZ" :code "NZL" :id "554"}
   "COSTA RICA"  {:name "COSTA RICA" :scode "CR" :code "CRI" :id "188"}
   "FRENCH POLYNESIA"  {:name "FRENCH POLYNESIA" :scode "PF" :code "PYF" :id "258"}
   "SLOVAKIA"  {:name "SLOVAKIA" :scode "SK" :code "SVK" :id "703"}
   "HUNGARY"  {:name "HUNGARY" :scode "HU" :code "HUN" :id "348"}
   "FIJI"  {:name "FIJI" :scode "FJ" :code "FJI" :id "242"}
   "VIRGIN ISLANDS (U.S.)"  {:name "VIRGIN ISLANDS (U.S.)" :scode "VI" :code "VIR" :id "850"}
   "ITALY"  {:name "ITALY" :scode "IT" :code "ITA" :id "380"}
   "TOGO"  {:name "TOGO" :scode "TG" :code "TGO" :id "768"}
   "NORTHERN MARIANA ISLANDS"  {:name "NORTHERN MARIANA ISLANDS" :scode "MP" :code "MNP" :id "580"}
   "ARUBA"  {:name "ARUBA" :scode "AW" :code "ABW" :id "533"}
   "MACAU"  {:name "MACAU" :scode "MO" :code "MAC" :id "446"}
   "BANGLADESH"  {:name "BANGLADESH" :scode "BD" :code "BGD" :id "050"}
   "BELGIUM"  {:name "BELGIUM" :scode "BE" :code "BEL" :id "056"}
   "SWITZERLAND"  {:name "SWITZERLAND" :scode "CH" :code "CHE" :id "756"}
   "UNITED ARAB EMIRATES"  {:name "UNITED ARAB EMIRATES" :scode "AE" :code "ARE" :id "784"}
   "JORDAN"  {:name "JORDAN" :scode "JO" :code "JOR" :id "400"}
   "PAPUA NEW GUINEA"  {:name "PAPUA NEW GUINEA" :scode "PG" :code "PNG" :id "598"}
   "BOLIVIA"  {:name "BOLIVIA" :scode "BO" :code "BOL" :id "068"}
   "INDONESIA"  {:name "INDONESIA" :scode "ID" :code "IDN" :id "360"}
   "SURINAME"  {:name "SURINAME" :scode "SR" :code "SUR" :id "740"}
   "WESTERN SAHARA"  {:name "WESTERN SAHARA" :scode "EH" :code "ESH" :id "732"}
   "NEW CALEDONIA"  {:name "NEW CALEDONIA" :scode "NC" :code "NCL" :id "540"}
   "SINGAPORE"  {:name "SINGAPORE" :scode "SG" :code "SGP" :id "702"}
   "BOSNIA AND HERZEGOWINA"  {:name "BOSNIA AND HERZEGOWINA" :scode "BA" :code "BIH" :id "070"}
   "NEPAL"  {:name "NEPAL" :scode "NP" :code "NPL" :id "524"}
   "IRAN (ISLAMIC REPUBLIC OF)"  {:name "IRAN (ISLAMIC REPUBLIC OF)" :scode "IR" :code "IRN" :id "364"}
   "AFGHANISTAN"  {:name "AFGHANISTAN" :scode "AF" :code "AFG" :id "004"}
   "HAITI"  {:name "HAITI" :scode "HT" :code "HTI" :id "332"}
   "MALTA"  {:name "MALTA" :scode "MT" :code "MLT" :id "470"}
   "NAURU"  {:name "NAURU" :scode "NR" :code "NRU" :id "520"}
   "MYANMAR"  {:name "MYANMAR" :scode "MM" :code "MMR" :id "104"}
   "COOK ISLANDS"  {:name "COOK ISLANDS" :scode "CK" :code "COK" :id "184"}
   "PARAGUAY"  {:name "PARAGUAY" :scode "PY" :code "PRY" :id "600"}
   "CROATIA (local name: Hrvatska)"  {:name "CROATIA (local name: Hrvatska)" :scode "HR" :code "HRV" :id "191"}
   "LESOTHO"  {:name "LESOTHO" :scode "LS" :code "LSO" :id "426"}
   "LUXEMBOURG"  {:name "LUXEMBOURG" :scode "LU" :code "LUX" :id "442"}
   "JAPAN"  {:name "JAPAN" :scode "JP" :code "JPN" :id "392"}
   "BURKINA FASO"  {:name "BURKINA FASO" :scode "BF" :code "BFA" :id "854"}
   "IRELAND"  {:name "IRELAND" :scode "IE" :code "IRL" :id "372"}
   "SEYCHELLES"  {:name "SEYCHELLES" :scode "SC" :code "SYC" :id "690"}
   "BAHAMAS"  {:name "BAHAMAS" :scode "BS" :code "BHS" :id "044"}
   "ARGENTINA"  {:name "ARGENTINA" :scode "AR" :code "ARG" :id "032"}
   "GAMBIA"  {:name "GAMBIA" :scode "GM" :code "GMB" :id "270"}
   "THAILAND"  {:name "THAILAND" :scode "TH" :code "THA" :id "764"}
   "MOLDOVA REPUBLIC OF"  {:name "MOLDOVA REPUBLIC OF" :scode "MD" :code "MDA" :id "498"}
   "GABON"  {:name "GABON" :scode "GA" :code "GAB" :id "266"}
   "MALDIVES"  {:name "MALDIVES" :scode "MV" :code "MDV" :id "462"}
   "SAINT HELENA"  {:name "SAINT HELENA" :scode "SH" :code "SHN" :id "654"}
   "TAIWAN"  {:name "TAIWAN" :scode "TW" :code "TWN" :id "158"}
   "GIBRALTAR"  {:name "GIBRALTAR" :scode "GI" :code "GIB" :id "292"}
   "KAZAKHSTAN"  {:name "KAZAKHSTAN" :scode "KZ" :code "KAZ" :id "398"}
   "CHAD"  {:name "CHAD" :scode "TD" :code "TCD" :id "148"}
   "COMOROS"  {:name "COMOROS" :scode "KM" :code "COM" :id "174"}
   "CZECH REPUBLIC"  {:name "CZECH REPUBLIC" :scode "CZ" :code "CZE" :id "203"}
   "KIRIBATI"  {:name "KIRIBATI" :scode "KI" :code "KIR" :id "296"}
   "FALKLAND ISLANDS (MALVINAS)"  {:name "FALKLAND ISLANDS (MALVINAS)" :scode "FK" :code "FLK" :id "238"}
   "ETHIOPIA"  {:name "ETHIOPIA" :scode "ET" :code "ETH" :id "231"}
   "GUYANA"  {:name "GUYANA" :scode "GY" :code "GUY" :id "328"}
   "COCOS (KEELING) ISLANDS"  {:name "COCOS (KEELING) ISLANDS" :scode "CC" :code "CCK" :id "166"}
   "ANDORRA"  {:name "ANDORRA" :scode "AD" :code "AND" :id "020"}
   "SPAIN"  {:name "SPAIN" :scode "ES" :code "ESP" :id "724"}
   "LITHUANIA"  {:name "LITHUANIA" :scode "LT" :code "LTU" :id "440"}
   "SENEGAL"  {:name "SENEGAL" :scode "SN" :code "SEN" :id "686"}
   "BOTSWANA"  {:name "BOTSWANA" :scode "BW" :code "BWA" :id "072"}
   "AALAND ISLANDS"  {:name "AALAND ISLANDS" :scode "AX" :code "ALA" :id "248"}
   "BRUNEI DARUSSALAM"  {:name "BRUNEI DARUSSALAM" :scode "BN" :code "BRN" :id "096"}
   "POLAND"  {:name "POLAND" :scode "PL" :code "POL" :id "616"}
   "TURKS AND CAICOS ISLANDS"  {:name "TURKS AND CAICOS ISLANDS" :scode "TC" :code "TCA" :id "796"}
   "GRENADA"  {:name "GRENADA" :scode "GD" :code "GRD" :id "308"}
   "TRINIDAD AND TOBAGO"  {:name "TRINIDAD AND TOBAGO" :scode "TT" :code "TTO" :id "780"}
   "ANGOLA"  {:name "ANGOLA" :scode "AO" :code "AGO" :id "024"}
   "LIBERIA"  {:name "LIBERIA" :scode "LR" :code "LBR" :id "430"}
   "YEMEN"  {:name "YEMEN" :scode "YE" :code "YEM" :id "887"}
   "BELIZE"  {:name "BELIZE" :scode "BZ" :code "BLZ" :id "084"}
   "TOKELAU"  {:name "TOKELAU" :scode "TK" :code "TKL" :id "772"}
   "NICARAGUA"  {:name "NICARAGUA" :scode "NI" :code "NIC" :id "558"}
   "CONGO Democratic Republic of (was Zaire)"  {:name "CONGO Democratic Republic of (was Zaire)" :scode "CD" :code "COD" :id "180"}
   "HEARD AND MC DONALD ISLANDS"  {:name "HEARD AND MC DONALD ISLANDS" :scode "HM" :code "HMD" :id "334"}
   "SOLOMON ISLANDS"  {:name "SOLOMON ISLANDS" :scode "SB" :code "SLB" :id "090"}
   "NIUE"  {:name "NIUE" :scode "NU" :code "NIU" :id "570"}
   "ANTIGUA AND BARBUDA"  {:name "ANTIGUA AND BARBUDA" :scode "AG" :code "ATG" :id "028"}
   "OMAN"  {:name "OMAN" :scode "OM" :code "OMN" :id "512"}
   "FAROE ISLANDS"  {:name "FAROE ISLANDS" :scode "FO" :code "FRO" :id "234"}
   "MAURITIUS"  {:name "MAURITIUS" :scode "MU" :code "MUS" :id "480"}
   "NAMIBIA"  {:name "NAMIBIA" :scode "NA" :code "NAM" :id "516"}
   "SWEDEN"  {:name "SWEDEN" :scode "SE" :code "SWE" :id "752"}
   "HONDURAS"  {:name "HONDURAS" :scode "HN" :code "HND" :id "340"}
   "SAN MARINO"  {:name "SAN MARINO" :scode "SM" :code "SMR" :id "674"}
   "PITCAIRN"  {:name "PITCAIRN" :scode "PN" :code "PCN" :id "612"}
   "MADAGASCAR"  {:name "MADAGASCAR" :scode "MG" :code "MDG" :id "450"}
   "BRITISH INDIAN OCEAN TERRITORY"  {:name "BRITISH INDIAN OCEAN TERRITORY" :scode "IO" :code "IOT" :id "086"}
   "MARSHALL ISLANDS"  {:name "MARSHALL ISLANDS" :scode "MH" :code "MHL" :id "584"}
   "BRAZIL"  {:name "BRAZIL" :scode "BR" :code "BRA" :id "076"}
   "SOUTH AFRICA"  {:name "SOUTH AFRICA" :scode "ZA" :code "ZAF" :id "710"}
   "GREECE"  {:name "GREECE" :scode "GR" :code "GRC" :id "300"}
   "MONTSERRAT"  {:name "MONTSERRAT" :scode "MS" :code "MSR" :id "500"}
   "TONGA"  {:name "TONGA" :scode "TO" :code "TON" :id "776"}
   "GUATEMALA"  {:name "GUATEMALA" :scode "GT" :code "GTM" :id "320"}
   "UNITED KINGDOM"  {:name "UNITED KINGDOM" :scode "GB" :code "GBR" :id "826"}
   "DOMINICAN REPUBLIC"  {:name "DOMINICAN REPUBLIC" :scode "DO" :code "DOM" :id "214"}
   "VATICAN CITY STATE (HOLY SEE)"  {:name "VATICAN CITY STATE (HOLY SEE)" :scode "VA" :code "VAT" :id "336"}
   "TURKEY"  {:name "TURKEY" :scode "TR" :code "TUR" :id "792"}
   "CANADA"  {:name "CANADA" :scode "CA" :code "CAN" :id "124"}
   "GREENLAND"  {:name "GREENLAND" :scode "GL" :code "GRL" :id "304"}
   "RWANDA"  {:name "RWANDA" :scode "RW" :code "RWA" :id "646"}
   "SUDAN"  {:name "SUDAN" :scode "SD" :code "SDN" :id "736"}
   "PALAU"  {:name "PALAU" :scode "PW" :code "PLW" :id "585"}
   "LATVIA"  {:name "LATVIA" :scode "LV" :code "LVA" :id "428"}
   "GUINEA"  {:name "GUINEA" :scode "GN" :code "GIN" :id "324"}
   "TUNISIA"  {:name "TUNISIA" :scode "TN" :code "TUN" :id "788"}
   "MOROCCO"  {:name "MOROCCO" :scode "MA" :code "MAR" :id "504"}
   "MONGOLIA"  {:name "MONGOLIA" :scode "MN" :code "MNG" :id "496"}
   "RUSSIAN FEDERATION"  {:name "RUSSIAN FEDERATION" :scode "RU" :code "RUS" :id "643"}
   "NETHERLANDS"  {:name "NETHERLANDS" :scode "NL" :code "NLD" :id "528"}
   "TANZANIA UNITED REPUBLIC OF"  {:name "TANZANIA UNITED REPUBLIC OF" :scode "TZ" :code "TZA" :id "834"}
   "BENIN"  {:name "BENIN" :scode "BJ" :code "BEN" :id "204"}
   "VANUATU"  {:name "VANUATU" :scode "VU" :code "VUT" :id "548"}
   "CUBA"  {:name "CUBA" :scode "CU" :code "CUB" :id "192"}
   "UNITED STATES MINOR OUTLYING ISLANDS"  {:name "UNITED STATES MINOR OUTLYING ISLANDS" :scode "UM" :code "UMI" :id "581"}
   "AMERICAN SAMOA"  {:name "AMERICAN SAMOA" :scode "AS" :code "ASM" :id "016"}
   "SAMOA"  {:name "SAMOA" :scode "WS" :code "WSM" :id "882"}
   "MALI"  {:name "MALI" :scode "ML" :code "MLI" :id "466"}
   "NIGERIA"  {:name "NIGERIA" :scode "NG" :code "NGA" :id "566"}
   "CAMEROON"  {:name "CAMEROON" :scode "CM" :code "CMR" :id "120"}
   "BHUTAN"  {:name "BHUTAN" :scode "BT" :code "BTN" :id "064"}
   "KYRGYZSTAN"  {:name "KYRGYZSTAN" :scode "KG" :code "KGZ" :id "417"}
   "FRENCH SOUTHERN TERRITORIES"  {:name "FRENCH SOUTHERN TERRITORIES" :scode "TF" :code "ATF" :id "260"}
   "PALESTINIAN TERRITORY Occupied"  {:name "PALESTINIAN TERRITORY Occupied" :scode "PS" :code "PSE" :id "275"}
   "SAINT LUCIA"  {:name "SAINT LUCIA" :scode "LC" :code "LCA" :id "662"}
   "GUADELOUPE"  {:name "GUADELOUPE" :scode "GP" :code "GLP" :id "312"}
   "CHRISTMAS ISLAND"  {:name "CHRISTMAS ISLAND" :scode "CX" :code "CXR" :id "162"}
   "GHANA"  {:name "GHANA" :scode "GH" :code "GHA" :id "288"}
   "ZIMBABWE"  {:name "ZIMBABWE" :scode "ZW" :code "ZWE" :id "716"}
   "ANGUILLA"  {:name "ANGUILLA" :scode "AI" :code "AIA" :id "660"}
   "MARTINIQUE"  {:name "MARTINIQUE" :scode "MQ" :code "MTQ" :id "474"}
   "CENTRAL AFRICAN REPUBLIC"  {:name "CENTRAL AFRICAN REPUBLIC" :scode "CF" :code "CAF" :id "140"}
   "GERMANY"  {:name "GERMANY" :scode "DE" :code "DEU" :id "276"}
   "AZERBAIJAN"  {:name "AZERBAIJAN" :scode "AZ" :code "AZE" :id "031"}
   "UZBEKISTAN"  {:name "UZBEKISTAN" :scode "UZ" :code "UZB" :id "860"}
   "ZAMBIA"  {:name "ZAMBIA" :scode "ZM" :code "ZMB" :id "894"}
   "SYRIAN ARAB REPUBLIC"  {:name "SYRIAN ARAB REPUBLIC" :scode "SY" :code "SYR" :id "760"}
   "BERMUDA"  {:name "BERMUDA" :scode "BM" :code "BMU" :id "060"}
   "MACEDONIA THE FORMER YUGOSLAV REPUBLIC OF"  {:name "MACEDONIA THE FORMER YUGOSLAV REPUBLIC OF" :scode "MK" :code "MKD" :id "807"}
   "SOMALIA"  {:name "SOMALIA" :scode "SO" :code "SOM" :id "706"}
   "LEBANON"  {:name "LEBANON" :scode "LB" :code "LBN" :id "422"}
   "MEXICO"  {:name "MEXICO" :scode "MX" :code "MEX" :id "484"}
   "MICRONESIA FEDERATED STATES OF"  {:name "MICRONESIA FEDERATED STATES OF" :scode "FM" :code "FSM" :id "583"}
   "AUSTRIA"  {:name "AUSTRIA" :scode "AT" :code "AUT" :id "040"}
   "QATAR"  {:name "QATAR" :scode "QA" :code "QAT" :id "634"}
   "TUVALU"  {:name "TUVALU" :scode "TV" :code "TUV" :id "798"}
   "ROMANIA"  {:name "ROMANIA" :scode "RO" :code "ROU" :id "642"}
   "FINLAND"  {:name "FINLAND" :scode "FI" :code "FIN" :id "246"}
   "BARBADOS"  {:name "BARBADOS" :scode "BB" :code "BRB" :id "052"}
   "SAINT KITTS AND NEVIS"  {:name "SAINT KITTS AND NEVIS" :scode "KN" :code "KNA" :id "659"}
   "CYPRUS"  {:name "CYPRUS" :scode "CY" :code "CYP" :id "196"}
   "PUERTO RICO"  {:name "PUERTO RICO" :scode "PR" :code "PRI" :id "630"}
   "MOZAMBIQUE"  {:name "MOZAMBIQUE" :scode "MZ" :code "MOZ" :id "508"}
   "ICELAND"  {:name "ICELAND" :scode "IS" :code "ISL" :id "352"}
   "ERITREA"  {:name "ERITREA" :scode "ER" :code "ERI" :id "232"}
   "WALLIS AND FUTUNA ISLANDS"  {:name "WALLIS AND FUTUNA ISLANDS" :scode "WF" :code "WLF" :id "876"}
   "EL SALVADOR"  {:name "EL SALVADOR" :scode "SV" :code "SLV" :id "222"}
   "INDIA"  {:name "INDIA" :scode "IN" :code "IND" :id "356"}
   "CHINA"  {:name "CHINA" :scode "CN" :code "CHN" :id "156"}
   "SAINT PIERRE AND MIQUELON"  {:name "SAINT PIERRE AND MIQUELON" :scode "PM" :code "SPM" :id "666"}
   "SWAZILAND"  {:name "SWAZILAND" :scode "SZ" :code "SWZ" :id "748"}
   "BULGARIA"  {:name "BULGARIA" :scode "BG" :code "BGR" :id "100"}
   "CAPE VERDE"  {:name "CAPE VERDE" :scode "CV" :code "CPV" :id "132"}
   "TAJIKISTAN"  {:name "TAJIKISTAN" :scode "TJ" :code "TJK" :id "762"}
   "BELARUS"  {:name "BELARUS" :scode "BY" :code "BLR" :id "112"}
   "BOUVET ISLAND"  {:name "BOUVET ISLAND" :scode "BV" :code "BVT" :id "074"}
   "PERU"  {:name "PERU" :scode "PE" :code "PER" :id "604"}
   "PANAMA"  {:name "PANAMA" :scode "PA" :code "PAN" :id "591"}
   "LIECHTENSTEIN"  {:name "LIECHTENSTEIN" :scode "LI" :code "LIE" :id "438"}
   "GUINEA-BISSAU"  {:name "GUINEA-BISSAU" :scode "GW" :code "GNB" :id "624"}
   "VIRGIN ISLANDS (BRITISH)"  {:name "VIRGIN ISLANDS (BRITISH)" :scode "VG" :code "VGB" :id "092"}
   "TIMOR-LESTE"  {:name "TIMOR-LESTE" :scode "TL" :code "TLS" :id "626"}
   "KOREA DEMOCRATIC PEOPLE'S REPUBLIC OF"  {:name "KOREA DEMOCRATIC PEOPLE'S REPUBLIC OF" :scode "KP" :code "PRK" :id "408"}
   "VENEZUELA"  {:name "VENEZUELA" :scode "VE" :code "VEN" :id "862"}
   "SRI LANKA"  {:name "SRI LANKA" :scode "LK" :code "LKA" :id "144"}
   "SVALBARD AND JAN MAYEN ISLANDS"  {:name "SVALBARD AND JAN MAYEN ISLANDS" :scode "SJ" :code "SJM" :id "744"}
   "IRAQ"  {:name "IRAQ" :scode "IQ" :code "IRQ" :id "368"}
   "SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS"  {:name "SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS" :scode "GS" :code "SGS" :id "239"}
   "SAO TOME AND PRINCIPE"  {:name "SAO TOME AND PRINCIPE" :scode "ST" :code "STP" :id "678"}
   "NIGER"  {:name "NIGER" :scode "NE" :code "NER" :id "562"}
   "DENMARK"  {:name "DENMARK" :scode "DK" :code "DNK" :id "208"}
   "EQUATORIAL GUINEA"  {:name "EQUATORIAL GUINEA" :scode "GQ" :code "GNQ" :id "226"}
   "LIBYAN ARAB JAMAHIRIYA"  {:name "LIBYAN ARAB JAMAHIRIYA" :scode "LY" :code "LBY" :id "434"}
   "GUAM"  {:name "GUAM" :scode "GU" :code "GUM" :id "316"}
   "DJIBOUTI"  {:name "DJIBOUTI" :scode "DJ" :code "DJI" :id "262"}
   "FRANCE"  {:name "FRANCE" :scode "FR" :code "FRA" :id "250"}
   "EGYPT"  {:name "EGYPT" :scode "EG" :code "EGY" :id "818"}
   "TURKMENISTAN"  {:name "TURKMENISTAN" :scode "TM" :code "TKM" :id "795"}
   "MAYOTTE"  {:name "MAYOTTE" :scode "YT" :code "MYT" :id "175"}
   "UKRAINE"  {:name "UKRAINE" :scode "UA" :code "UKR" :id "804"}
   "MALAWI"  {:name "MALAWI" :scode "MW" :code "MWI" :id "454"}
   "MALAYSIA"  {:name "MALAYSIA" :scode "MY" :code "MYS" :id "458"}
   "KENYA"  {:name "KENYA" :scode "KE" :code "KEN" :id "404"}
   "REUNION"  {:name "REUNION" :scode "RE" :code "REU" :id "638"}
   "COLOMBIA"  {:name "COLOMBIA" :scode "CO" :code "COL" :id "170"}
   "JAMAICA"  {:name "JAMAICA" :scode "JM" :code "JAM" :id "388"}
   "NORFOLK ISLAND"  {:name "NORFOLK ISLAND" :scode "NF" :code "NFK" :id "574"}
   "VIET NAM"  {:name "VIET NAM" :scode "VN" :code "VNM" :id "704"}
   "UGANDA"  {:name "UGANDA" :scode "UG" :code "UGA" :id "800"}
   "ALBANIA"  {:name "ALBANIA" :scode "AL" :code "ALB" :id "008"}
   "CHILE"  {:name "CHILE" :scode "CL" :code "CHL" :id "152"}
   "ECUADOR"  {:name "ECUADOR" :scode "EC" :code "ECU" :id "218"}
   "HONG KONG"  {:name "HONG KONG" :scode "HK" :code "HKG" :id "344"}
   "CAYMAN ISLANDS"  {:name "CAYMAN ISLANDS" :scode "KY" :code "CYM" :id "136"}
   "ESTONIA"  {:name "ESTONIA" :scode "EE" :code "EST" :id "233"}
   "PAKISTAN"  {:name "PAKISTAN" :scode "PK" :code "PAK" :id "586"}
   "CONGO Republic of"  {:name "CONGO Republic of" :scode "CG" :code "COG" :id "178"}
   "BAHRAIN"  {:name "BAHRAIN" :scode "BH" :code "BHR" :id "048"}
   "ARMENIA"  {:name "ARMENIA" :scode "AM" :code "ARM" :id "051"}
   "BURUNDI"  {:name "BURUNDI" :scode "BI" :code "BDI" :id "108"}
   "KOREA REPUBLIC OF"  {:name "KOREA REPUBLIC OF" :scode "KR" :code "KOR" :id "410"}
   "SAUDI ARABIA"  {:name "SAUDI ARABIA" :scode "SA" :code "SAU" :id "682"}
   "GEORGIA"  {:name "GEORGIA" :scode "GE" :code "GEO" :id "268"}
   "LAO PEOPLE'S DEMOCRATIC REPUBLIC"  {:name "LAO PEOPLE'S DEMOCRATIC REPUBLIC" :scode "LA" :code "LAO" :id "418"}
   "PORTUGAL"  {:name "PORTUGAL" :scode "PT" :code "PRT" :id "620"}
   "NORWAY"  {:name "NORWAY" :scode "NO" :code "NOR" :id "578"}
   "URUGUAY"  {:name "URUGUAY" :scode "UY" :code "URY" :id "858"}
   "ANTARCTICA"  {:name "ANTARCTICA" :scode "AQ" :code "ATA" :id "010"}
   "SAINT VINCENT AND THE GRENADINES"  {:name "SAINT VINCENT AND THE GRENADINES" :scode "VC" :code "VCT" :id "670"}
   "SERBIA AND MONTENEGRO"  {:name "SERBIA AND MONTENEGRO" :scode "CS" :code "SCG" :id "891"}
   "KUWAIT"  {:name "KUWAIT" :scode "KW" :code "KWT" :id "414"}
   "SIERRA LEONE"  {:name "SIERRA LEONE" :scode "SL" :code "SLE" :id "694"}
   "UNITED STATES"  {:name "UNITED STATES" :scode "US" :code "USA" :id "840"}
   "FRENCH GUIANA"  {:name "FRENCH GUIANA" :scode "GF" :code "GUF" :id "254"}})

(def country-names (sort (map first countries)))
   