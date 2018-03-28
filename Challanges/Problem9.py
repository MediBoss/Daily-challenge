#Write a program to compute and tell if two lines have the same slope
#Simple intro python program

    #Line one
x1  = 1
y1 = 2
x2 = -1
y2 = 4

    #Line two

a1 = 2
b1 = -3
a2 = 4
b2 = -2

m1 = (y2-y1) / (x2-x1)
m2 = (b2-b1) / (a2-a1)

if m1 == m2 :

    print ('Same slope')

else :

    print('Different slope')
