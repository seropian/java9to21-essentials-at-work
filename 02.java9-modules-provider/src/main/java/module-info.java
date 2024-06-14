import org.example.provider.service.SomeService;
import org.example.provider.service.impl.SomeServiceImpl;

module java9.modules.provider {
    exports org.example.provider.package2; // exports: makes the public types of a package available to other modules
    exports org.example.provider.service; // exports: makes the public types of a package available to other modules
    opens org.example.provider.package2; // opens: allows deep reflection into a package by other modules
    provides SomeService with SomeServiceImpl; // provides: declares that a module provides a service or implementation
}