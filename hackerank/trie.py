class Trie:
    def __init__(self):
        self.root = Node(" ")

    def insert(self, value, node):
        node.count += 1
        if value == "":
            return
        else:
            if not value[0] in node.d:
                node.d[value[0]] = Node(value[0])
            self.insert(value[1:], node.d[value[0]])

    def prefix_search(self, value, node):
        if value == "":
            return node.count
        else:
            if value[0] in node.d:
                return self.prefix_search(value[1:], node.d[value[0]])
            else:
                return 0


class Node:
    def __init__(self, value):
        self.value = value
        self.count = 0
        self.d = {}
