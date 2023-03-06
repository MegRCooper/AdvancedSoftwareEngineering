# Task Five:
def alarmTask(time, hours):
    print("The time of the alarm will be: " + str(((time + gapHours) % 24).__round__(2)))


currntTime = float(input("Please enter the current time in hours: "))
gapHours = float(input("Please enter the  number of hours before the alarm: "))
alarmTask(currntTime, gapHours)