from Cat import Cat
from Owl import Owl
from Dog import Dog
from Salmon import Salmon

cat1 = Cat(True, 90)
cat1.setName("Barsik")
cat1.setAge(5)
dog1 = Dog("Dog", 70)
dog1.setName("Sharik")
dog1.setAge(3)
owl1 = Owl(True, 80)
owl1.setName("Buklya")
owl1.setAge(50)

salmon1 = Salmon(False)
print(owl1)
owl1.feed(salmon1)
print(owl1)
