from multiprocessing import Pipe, Process


def f(conn):
    while True:
        aux = conn.recv()
        if aux == "q":
            conn.close()
            break
        else:
            conn.send(aux * 2)


if __name__ == "__main__":
    parent_conn, child_conn = Pipe()
    p = Process(target=f, args=(child_conn,))
    p.start()
    while True:
        aux = input()
        parent_conn.send(aux)
        if aux == "q":
            p.join()
            break
        else:
            print(parent_conn.recv())  # prints "[42, None, 'hello']"
