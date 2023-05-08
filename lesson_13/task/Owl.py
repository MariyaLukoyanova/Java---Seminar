from Animal import Animal
from Salmon import Salmon

class Owl(Animal):
    def __init__(self, isDomesticated, hunger):
        self.__isDomesticated = isDomesticated
        self.__hunger = hunger

    def feed(self, salmon):
        if isinstance(salmon,Salmon):
            if(salmon.isCooked()):
                self.__hunger-=10
            else:
                self.__hunger-=9

    def voice(self):
        pass

    def isInGoodMood(self):
        return self.__isInGoodMood

    def setInGoodMood(self, inGoodMood):
        self.__isInGoodMood = inGoodMood

    def getHunger(self):
        return self.__hunger

    def setHunger(self, hunger):
        self.__hunger = hunger

    def setAge(self, age):
        self.__age = age

    def setName(self, name):
        self.__name = name

    def getName(self):
        return self.__name

    def getAge(self):
        return self.__age

    def __str__(self):
        return f"name:{self.__name} age:{self.__age} hunger:{self.__hunger} isDomesticated:{self.__isDomesticated}"