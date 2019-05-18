;; import the clojure package 
(require '[clojure.string :as str])
(str/blank? "") ;; check if string is blank
;; -> true
(str/capitalize "this is fun")
;;-> "This is fun"
(str/upper-case "this could be fun")
;;-> "THIS COULD BE FUN"
(str/lower-case "PUT INTO LOWERS")
;;-> "put into lowers"
(str/replace "i m replacing words", "replacing","playing with")
;;-> "i m playing with words"
(str/triml "   trim fun")
;;-> "trim fun"
(str/trimr "trim later.  \n")
;;-> "trim later."

;; -----------------------------------------------
;; to combine multiple strings value or collections into one strings

(str "Disco" " " "machine")
;;->"Disco machine"
(def first-var "disco")
(def second-var "machine")
(def third-var 82)

;; with variables
(str first-var "-" second-var "-" third-var)
;;->"Disco-machine-82"

;; use apply with str to concatenate a collection of values into a single string
;; seq of chars back into a string
(apply str "Disco " [\m \a \c \h \i \n \e])
;; "Disco machine"

;; concat string flatterned with array
(def lines ["Disco", "Machine"])
(apply str lines)
;;->"DiscoMachine"

;; join strings 
(def food-items ["milk" "butter" "flour" "eggs"])
(str/join ", ", food-items)
;;->"milk, butter, flour, eggs"

;; -------------------------------------------
;; converting a string into sequence of characters
(seq "Hello, world!")
;;-> (\H \e \l \l \o \, \space \w \o \r \l \d \!)

;; get frequencies of chars in a sentence
(frequencies (str/lower-case "working with many people sometime makes me nuts"))
;;->{\space 7, \a 2, \e 6, \g 1, \h 1, \i 3, \k 2, \l 1, \m 5, \n 3, \o 3, \p 2, \r 1, \s 3, \t 3, \u 1, \w 2, \y 1} 



;; define a function called yelling which takes an 
;; string argument and check if string is fully captialized
;; 
(defn yelling? [s]
  (every? #(or (not (Character/isLetter %))
                     (Character/isUpperCase %))
              s))
(yelling? "WHY THE HECK")
;;-> true
(yelling? "WHY THE heck")
;;-> false



