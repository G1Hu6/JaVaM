sum = 0
n = 1456
temp = n

while n > 0:
    rem = n % 10
    i = 1;
    fact = 1;
    while i <= rem:
        fact = fact*i;
        i += 1
    sum = fact + sum
    n = n//10
if temp == sum:
    print("strong number");
else:
    print("Not Strong number");
