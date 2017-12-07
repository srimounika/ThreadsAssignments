import threading
import time
print("Start")
def Testcase1():
    time.sleep(1)
def Testcase2():
    time.sleep(2)
def Testcase3():
    time.sleep(3)
def Testcase4():
    time.sleep(4)
start_time = time.time()
threading.Thread(target=Testcase1).start()
threading.Thread(target=Testcase2).start()
threading.Thread(target=Testcase3).start()
#threading.Thread(target=Testcase4()).start()
t1 = threading.Thread(target=Testcase4())
t1.start()
t1.join()
end_time = time.time()
print("total time for 4 testcases ",round(end_time-start_time), "seconds")
print("Done")

