x = int(input())
left = x
list = []
while x != 0:
    x = x%2
    left = left//2
    list.append(x)
    x = left
list = list[::-1]
string = "".join(str(x) for x in list)
print(string)
    
