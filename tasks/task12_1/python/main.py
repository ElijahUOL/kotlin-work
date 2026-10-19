# Task 12.1: program that uses a Point object
from point import Point
# Remember that you'll need an import statement to access the class!
p = Point(1.0, 1.0)
p1 = Point(4.55, 7.0)
print(p.x)
print(p.y)
print(f"{p.distance}")
print(f"{p.distanceTo(p1)}")