import dev.whyoleg.kamp.project.*

//Autogenerated with kamp, don't change

object ProjectModules {
    val json = ProjectModule(":json")
    val api = ProjectModule(":api")
    val api_client = ProjectModule(":api-client")
    val client = ProjectModule(":client")
    val client_api = ProjectModule(":client-api")
    val clients = ProjectModule(":clients")

    object Clients {
        val client_deferred = ProjectModule(":clients-client-deferred")
        val client_rx2 = ProjectModule(":clients-client-rx2")
        val client_rx3 = ProjectModule(":clients-client-rx3")
        val client_reactor = ProjectModule(":clients-client-reactor")
        val client_reaktive = ProjectModule(":clients-client-reaktive")
    }
    val storage = ProjectModule(":storage")

    object Storage {
        val storage_channel = ProjectModule(":storage-storage-channel")
    }
    val updates = ProjectModule(":updates")

    object Updates {
        val updates_flow = ProjectModule(":updates-updates-flow")
    }
    val runners = ProjectModule(":runners")

    object Runners {
        val runner_coroutines = ProjectModule(":runners-runner-coroutines")
    }
}
