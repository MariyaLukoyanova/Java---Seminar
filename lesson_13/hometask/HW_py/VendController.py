from Drink import Drink
from DrinkMachine import DrinkMachine
from GetDrink import GetDrink

class VendController(DrinkMachine):

    def getDrink(self):
        GetDrink.getDrink(self)

    def setDrink(self, drink):
        DrinkMachine.setDrink(self, drink)

    def getMenu(self):
        DrinkMachine.getMenu(self)
