from playLA.Vector import Vector
if __name__ == '__main__':
    vec = Vector([5,2])
    print(vec)
    print(len(vec))
    print("vec[0] ={}, vec[1] ={}".format(vec[0], vec[1]))

    vec2=Vector([3,1])
    print("{} + {}= {}".format(vec, vec2, vec+vec2))


    print("{} * {}= {}".format(vec, 3, vec*3))
    print("{} * {}= {}".format(vec, 3, 3*vec))
