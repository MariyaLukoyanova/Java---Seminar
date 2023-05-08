from abc import ABC, abstractmethod


class Animal(ABC):
    @abstractmethod
    def voice():
        pass

    @abstractmethod
    def feed(hunger):
        pass

    @abstractmethod
    def getName():
        pass

    @abstractmethod
    def setName(name):
        pass

    @abstractmethod
    def getAge():
        pass

    @abstractmethod
    def setAge(age):
        pass
