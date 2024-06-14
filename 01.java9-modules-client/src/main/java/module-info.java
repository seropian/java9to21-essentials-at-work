import org.example.provider.service.SomeService;

module java9.modules.client {
    requires java9.modules.provider; // requires: specifies that this module depends on another module
    uses SomeService; // uses: declares that a module uses a service
}