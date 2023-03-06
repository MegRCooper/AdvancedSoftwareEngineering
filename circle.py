# Task One:
def circle(rad):
    pi = 3.14159
    area = pi * (rad * rad)
    circumference = 2 * pi * rad
    print("Area of the Circle: " + str(area))
    print("Circumference of the Circle: " + str(circumference))


radius = float(input("Input the radius of the circle: "))
circle(radius)