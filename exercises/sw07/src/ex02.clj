(let [a 1 b 2 c 3]
  (let [b c]
    (let [a b]
      (let [c a]
        [a b c]))))

; [3 3 3]
; Scope 1: a=1, b=2, c=3
;   Scope 2: b=c => b=3
;     Scope 3: a=b => a=3
;       Scope 4: c=a => c=3