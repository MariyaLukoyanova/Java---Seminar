
class Drink:

    def __init__(self, name, volume):
        self._name = name
        self._volume = volume

    def getName(self):
        return self._name
    
    def getVolume(self):
        return self._volume
    
    def __str__(self):
        return f"{self._name} volume {self._volume}"
    

    