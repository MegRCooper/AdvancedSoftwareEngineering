# Task Two:
def salesPrediction(projectedSales):
    annualProfit = 0.23
    estSales = projectedSales + (projectedSales * annualProfit)
    print("Estimated profit for next year is: £" + str(estSales.__round__(2)))
    i = 2
    while i <= 10:
        annualProfit += 0.05
        estSales = estSales + (estSales * annualProfit)
        print("Profit for year " + str(i) + " is £" + str(estSales.__round__(2)))
        i += 1


projectedSalesAmount = float(input("What is the projected amount of total sales: £"))
salesPrediction(projectedSalesAmount)