from Drink import Drink

class HotDrink(Drink):

    def __init__(self, name, volume, temperature):
        self._name = name
        self._volume = volume
        self._temperature = temperature

    def getTemp(self):
        return self._temperature
    
    def setTemperature(self, temp):
        self._temperature = temp
    
    def __str__(self):
        return f"{self._name} volume {self._volume} temperature {self._temperature}" 

