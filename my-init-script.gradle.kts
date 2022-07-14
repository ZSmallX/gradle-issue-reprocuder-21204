settingsEvaluated {
    println("Init script: settingsEvaluated called.")
    pluginManagement {
        repositories {
            google()
        }
    }
}

beforeSettings {
    println("Init script: beforeSettings called.")
    pluginManagement {
        repositories {
            google()
        }
    }
}