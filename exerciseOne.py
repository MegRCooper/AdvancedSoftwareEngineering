# Task Four:
def exerciseOne(a):
    b = a + 2
    a = b * 4
    b = a / 3.14
    c = b - 8
    print("Value of A: " + str(a.__round__(2)) + "\n"
          "Value of B: " + str(b.__round__(2)) + "\n"
          "Value of C: " + str(c.__round__(2)))


a = 1.14
exerciseOne(a)