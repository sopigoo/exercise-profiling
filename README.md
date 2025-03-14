Name : Siti Shofi Nadhifa <br>
NPM : 2306152172 <br>
Class : AdPro B

# Module 5 - Java Profiling

## Screenshots
### Before Optimization
`/all-student`
- JMeter GUI
  ![/all-student-jmeter-gui/](/images/all-student-jmeter-gui.png)
- cmd
  ![/all-student-cmd/](/images/all-student-cmd.png)

`/all-student-name`
- JMeter GUI
  ![/all-student-name-jmeter-gui/](/images/all-student-name-jmeter-gui.png)
- cmd
  ![/all-student-name-cmd/](/images/all-student-name-cmd.png)

`/highest-gpa`
- JMeter GUI
  ![/highest-gpa-jmeter-gui/](/images/highest-gpa-jmeter-gui.png)
- cmd
  ![/highest-gpa-cmd/](/images/highest-gpa-cmd.png)

### After Optimization
`/all-student`
- cmd
  ![/all-student-opt/](/images/all-student-opt.png)

`/all-student-name`
- cmd
  ![/all-student-name-opt/](/images/all-student-name-opt.png)

`/highest-gpa`
- cmd
  ![/highest-gpa-opt/](/images/highest-gpa-opt.png)

## Reflection
### Difference between the approach of performance testing with JMeter and profiling with IntelliJ Profiler in the context of optimizing application performance
JMeter is mainly used for performance testing by simulating user load and measuring response times, throughput, and system behavior under different conditions.
It helps identify how the application performs under stress. On the other hand, IntelliJ Profiler is focused on analyzing code execution, memory usage, and CPU consumption.
It provides insights into performance bottlenecks at the code level, such as slow methods, memory leaks, or inefficient loops.
### How Profiling Helps Identify My Application's Weak Points
Profiling has been incredibly useful in pinpointing weak spots in my application. Instead of just knowing that my application is slow, I get to see why it's slow.
It’s eye-opening to see how certain methods that seem harmless at first can turn out to be performance bottlenecks.
Seeing memory allocations and CPU usage in real time helps me understand the impact of my code decisions.
### Effectiveness of IntelliJ Profiler
I do find IntelliJ Profiler effective in helping me analyze bottlenecks.
The ability to visualize execution times and track down resource-heavy operations makes it much easier to address performance issues.
However, I’ve learned that profiling alone isn’t enough, which means that I need to combine it with real-world load testing (like JMeter) to get the full picture.
### Challenges in Performance Testing and Profiling
One of the biggest challenges in performance testing and profiling is ensuring that test scenarios accurately reflect real conditions.
Simply finding slow functions isn’t enough; I need to understand how they impact the system as a whole.
Optimizing performance also carries risks, as changes can unintentionally break functionality or shift bottlenecks elsewhere.
To address these challenges, I rely on automated testing, in-depth profiling analysis, and an iterative approach to ensure optimizations are both effective and reliable.
### Benefits of Using IntelliJ Profiler
Using IntelliJ Profiler provides significant benefits, especially in understanding how my application behaves at a deeper level.
It allows me to visualize execution times, track down resource-heavy operations, and detect inefficiencies like redundant computations or memory leaks.
These insights help me optimize specific areas of my code, leading to better performance and responsiveness.
### Handling Inconsistencies Between Profiling and JMeter
When profiling results from IntelliJ Profiler don’t fully align with JMeter’s performance testing findings, I take a step back and compare the test conditions.
Profiling typically runs in a controlled environment, while JMeter simulates real-world traffic, accounting for factors like network latency and concurrent users.
By analyzing both perspectives, I can identify whether the issue lies in the application logic itself or if external factors are contributing to the performance differences.
### Optimization Strategies and Ensuring Functionality
To optimize application code after analyzing performance testing and profiling results, I focus on refactoring inefficient code, optimizing resource usage, and improving algorithm efficiency.
However, I need to ensure that optimizations do not introduce new bugs or negatively impact the application’s functionality.
To ensure this, I conduct thorough testing, including unit tests, integration tests, and regression tests, to verify that all functionalities still work as expected after making changes.
