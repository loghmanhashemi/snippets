import numpy as np
import matplotlib.pyplot as plt

points = np.arange(-5, 5, 0.01) # 100 equally spaced points
xs, ys = np.meshgrid(points, points)
z = np.sqrt(xs ** 2 + ys ** 2)
a=plt.imshow(z, cmap=plt.cm.gray, extent=[-5, 5, -5, 5])
print(a)
b=plt.colorbar()
print(b)
c=plt.title("Image plot of $\sqrt{x^2 + y^2}$ for a grid of values")
print(c)