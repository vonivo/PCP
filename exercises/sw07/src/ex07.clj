(def my-phone-dir
  (atom
   [{:name "Anna" :phone 1234}
    {:name "Ben" :phone 5678}]))


; --------- a) ---------
; Dies wiederspricht fundamental dem Ansatz der funktionalen Programmierung
; da hier mit veränderlichem Zustand gearbeitet wird.

; --------- b) ---------
(defn look-at [phone-dir name]
  (:phone (first (filter #(= name (:name %)) @phone-dir))))

; --------- c) ---------
(defn add-entry [phone-dir name number]
  (swap! phone-dir conj {:name name :phone number})
  nil)

(look-at my-phone-dir "Anna")
(look-at my-phone-dir "Ben")
(look-at my-phone-dir "Alex")
(add-entry my-phone-dir "Alex" 2468)
(look-at my-phone-dir "Alex")