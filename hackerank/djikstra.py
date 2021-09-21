inf = float('inf')

class Graph:
  def __init__(self):
    self.nodes = {}

class Edge:
  def __init__(self, dst, cost):
    self.dst = dst
    self.cost = cost

class Node:
  def __init__(self, n):
    self.value = n
    self.tc = inf
    self.edges = []
    self.visited = False

def create_graph(n):
  g = Graph()
  for i in range(1, n+1):
    g.nodes[i] = Node(i)
  return g

def start_graph(g, s):
  g.nodes[s].tc = 0
  for i in range(1, n+1):
    if i != s:
      g.nodes[i].tc = inf
      g.nodes[i].visited = False
  return g

def clear_visited(g):
  for node in g.nodes.values():
    node.visited = False
  return g

def connect(u, v, g):
  g.nodes[u].edges.append(Edge(g.nodes[v], 6))
  g.nodes[v].edges.append(Edge(g.nodes[u], 6))

def calc_distance(start, end, g):
  if len(g.nodes[end].edges) == 0:
    return -1
  elif g.nodes[end].tc != float('inf'):
    return g.nodes[end].tc
  else:
    current_node = g.nodes[start]
    while current_node.value != end:
      current_node.visited = True
      for edge in current_node.edges:
        if g.nodes[edge.dst.value].tc > (current_node.tc + edge.cost):
          g.nodes[edge.dst.value].tc = (current_node.tc + edge.cost)
      minimum = inf
      value = -1
      for node in g.nodes.values():
        if node.tc < minimum and not node.visited and len(g.nodes[node.value].edges) > 0:
          minimum = node.tc
          value = node.value
      if value != -1:
        current_node = g.nodes[value]
      else:
        return -1
    return current_node.tc

q = int(input())
for _ in range(q):
  n, m = [int(e) for e in input().split(' ')]
  g = create_graph(n)
  for _ in range(m):
    u, v = [int(e) for e in input().split(' ')]
    connect(u, v, g)
  s = int(input())
  start_graph(g, s)
  z = []
  for i in range(1, n+1):
    if i != s:
      clear_visited(g)
      z.append(calc_distance(s, i, g))
  print(' '.join([str(e) for e in z]))
