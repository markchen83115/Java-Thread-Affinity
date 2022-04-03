## Java-Thread-Affinity

將java執行於指定的core上, 但無法指定第一顆core (number=0)

範例:

bind於第3個core (0, 1, 2, 3, ...)

![2022-04-03_231142](https://user-images.githubusercontent.com/60567753/161434666-65c81d3e-6f26-417b-86a9-00744745eecd.jpg)

bind於第6個core (number=5)

![2022-04-03_231212](https://user-images.githubusercontent.com/60567753/161434676-c126d4d6-0ed6-4cdd-a4a1-cf778f467a7a.jpg)



參考: https://github.com/OpenHFT/Java-Thread-Affinity
