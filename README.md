fork from xtc/superc to experiment in the context of the TypeChef project

http://cs.nyu.edu/rgrimm/xtc/



Commited to github to make changes transparent. If you are interested in using Xtc or SuperC please refer to the original site.



Changes in SuperC for use in TypeChef
====


 * Enable error reporting. Silently failing when a header file is not found is unsound. Added error reporting also in other locations.

 * Extend error reporting to report location and presence condition

 * No Buildin Pathes or Macros. They depend on the system (and are different in different configurations) and should not
 be set by the preprocessor. Unsound behavior.

 * Disabled unsound header guard heuristic.

 * Replicate TypeChef's behavior with regard to non-Boolean macros: Always reduce to Boolean, assume value 0 for undefined macros (like cpp). Issuing a warning.



(Several of these were available as options. Setting appropriate defaults)
