from VendController import VendController
from Drink import Drink
from Cocktail import Cocktail
from HotDrink import HotDrink


class main:
    user = VendController()
    user.setDrink(Drink("Cola", 500))
    user.setDrink(HotDrink("coffee", 200, 50))
    user.setDrink(Drink("Pepsi", 500))
    user.setDrink(HotDrink("tea", 400, 70))
    user.setDrink(Cocktail("Rom", 50, 40.0))
    user.setDrink(Cocktail("Wine", 150, 12.5))

    user.getMenu()
    user.getDrink()
    