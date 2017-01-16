 Readers Writers Problem

Here one has a system of r readers and w writers that all access a common database
(or some other resource). A reader may share the resource with an unlimited number
of other readers, but a writer must be in exclusive control of the resource. We call
this the RW problem. Two additional constraints characterize variants of the problem.
Problem RW1. As soon as a writer is ready to write, no new reader should get
permission to run. Starvation of readers is a possibility here.
Problem RW2. No writer is permitted to start running if there are any waiting
readers. Here it is possible to starve the writers.
