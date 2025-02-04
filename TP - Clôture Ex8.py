def calculateDiscount(product_list, discount):
    total_price = 0
    for item in product_list:
        total_price += discount(item[1])
    return total_price

product_list_exemple = [['Jambon', 10], ['Avion', 120], ['Carton', 50]]
disount20 = lambda x: x * 0.8

print(calculateDiscount(product_list_exemple, disount20))
