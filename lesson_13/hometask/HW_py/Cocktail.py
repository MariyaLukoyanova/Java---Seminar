from Drink import Drink

class Cocktail(Drink):

    def __init__(self, name, volume, abv):
        self._name = name
        self._volume = volume
        self._ABV = abv

    def getTemp(self):
        return self._ABV
    
    def setTemperature(self, abv):
        self._ABV = abv
    
    def __str__(self):
        return f"{self._name} volume {self._volume} alcohol {self._ABV}" 