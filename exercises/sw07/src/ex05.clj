(for [a (range 1 100)
      b (range 1 100)
      c (range 1 100)
      :when (== (Math/pow c 2) (+ (Math/pow a 2) (Math/pow b 2)))] [a b c])