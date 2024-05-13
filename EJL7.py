class Punto3D:
    def __init__(self):
        self.__x=0
        self.__y=0
        self.__z=0

    def __init__(self, x, y, z):
        self.__x = x
        self.__y = y
        self.__z = z
    

    def get_x(self):
        return self.__x

    def get_y(self):
        return self.__y

    def get_z(self):
        return self.__z

    def set_x(self, x):
        self.__x = x

    def set_y(self, y):
        self.__y = y

    def set_z(self, z):
        self.__z = z

    def distancia(self, otro_punto):
        from math import sqrt
        dx = self.__x - otro_punto.get_x()
        dy = self.__y - otro_punto.get_y()
        dz = self.__z - otro_punto.get_z()
        return sqrt(dx ** 2 + dy ** 2 + dz ** 2)

punto1=Punto3D(1,2,3)  
punto2=Punto3D(4,5,6) 
print(f"La distancia entre el punto 1 y el 2 es: ",punto1.distancia(punto2))

puntos=[
    Punto3D(1, 2, 3),
    Punto3D(4, 5, 6),
    Punto3D(7, 8, 9),
    Punto3D(2, 2, 3),
    Punto3D(4, 7, 6),
    Punto3D(7, 9, 9),
    Punto3D(1, 4, 3),
    Punto3D(9, 7, 6),
    Punto3D(7, 5, 9),
    Punto3D(6,4,7)
]

distancias = []
for i in range(len(puntos)):
    for j in range(i + 1, len(puntos)):
        distancias.append(puntos[i].distancia(puntos[j]))
print(f"distacias:\n ",distancias)
        
        
distancia_minima = min(distancias)
print("La distancia minima es:", distancia_minima)

