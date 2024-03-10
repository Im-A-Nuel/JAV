# x=0
# y=0

# while(x<10):
#     x+=1
#     if(x%10==0):
#         continue
#     else:
#         y+=x
# print("Sum of 1-10 : ",y)

# print("sum of 0...n")
# n = int(input("Masukkan n : "))
# result = n*(n-1)/2
# print(f"Sum of 0...{n} is : {int(result)}")

import matplotlib.image as mimg
import matplotlib.pyplot as plt

source = mimg.imread('Cross-Straight Cable.jpg')
plt.imshow(source)
# plt.axis('off')
plt.show()