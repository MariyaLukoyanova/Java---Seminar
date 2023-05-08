from VendMachine import VendMachine
from Drink import Drink

class DrinkMachine(VendMachine):

    def __init__(self):
        super().__init__()
        self.__menu = list()

    def getMenu(self):
        for drink in self.__menu:
            print(drink)
        
    def setDrink(self, product):
        if isinstance(product, Drink):
            self.__menu.append(product)


