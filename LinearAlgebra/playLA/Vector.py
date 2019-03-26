class Vector:
    def __init__(self, lst):
        self._values = list(lst)

    @classmethod
    def zero(cls,dim):
        return cls([0]*dim)

    def __add__(self, another):
        assert len(self) == len(another), \
            "Error in adding"
        return Vector([a + b for a, b in zip(self._values, another._values)])

    def __sub__(self, another):
        assert len(self) == len(another), \
            "Error in substracting"
        return Vector([a - b for a, b in zip(self._values, another._values)]) # 生成表达式

    def __mul__(self, k):
        return Vector([k * e for e in self])

    def __rmul__(self, k):
        return self * k

    def __pos__(self):
        return 1 * self

    def __neg__(self):
        return -1 * self

    def __iter__(self):
        return self._values.__iter__()

    def __getitem__(self, index):
        return self._values[index]

    def __len__(self):
        return len(self._values)

    def __repr__(self):
        return "Vector({})".format(self._values)

    def __str__(self):
        return "({})".format(", ".join(str(e) for e in self._values))
