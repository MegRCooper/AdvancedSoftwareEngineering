# Task Three:
def offer_loan(age, annualIncome, previousLoan):
    if (age >= 21) and (annualIncome >= 21000.00) and (previousLoan == "N"):
        print("The loan can be offered: True")
    else:
        print("The loan can be offered: False")


age = int(input("Please enter your age in years: \n"))
annualIncome = float(input("Please enter your annual income: \n"))
previousLoan = str(input("Have you ever had a loan before (Y/N): \n"))
offer_loan(age, annualIncome, previousLoan)