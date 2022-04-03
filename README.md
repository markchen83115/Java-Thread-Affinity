## Java-Thread-Affinity

將java執行於指定的core上, 但無法指定第一顆core (number=0)

範例:
bind於第3個core (0, 1, 2, 3, ...)
![2022-04-03_230641](https://user-images.githubusercontent.com/60567753/161434545-2cbe2847-5d58-4c4e-87b6-cc2b19223e75.jpg)

bind於第6個core (number=5)
![2022-04-03_230719](https://user-images.githubusercontent.com/60567753/161434570-669f4a91-eb80-4bcb-82bd-4d3fe1d47744.jpg)


參考: https://github.com/OpenHFT/Java-Thread-Affinity
