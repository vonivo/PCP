(defn sum-numbers [nums]
  (map println nums) ; println wird nie ausgeführt
  (reduce + nums))

(sum-numbers '(1 2 3 4 5))

; println wird nicht ausgeführt, da map lazy ist
; da niemand die werte von Map-Benötigt, wird es garnicht
; ausgeführt

(defn sum-numbers1 [nums]
  (doall (map println nums)) ; println wird nie ausgeführt
  (reduce + nums))

(sum-numbers1 '(1 2 3 4 5))

(defn sum-numbers2 [nums]
  (dorun (map println nums)) ; println wird nie ausgeführt
  (reduce + nums))

(sum-numbers2 '(1 2 3 4 5))