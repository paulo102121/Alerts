# Alerts

[Add it in your root build.gradle] at the end of repositories:

#Gradle 


Add it in your root build.gradle at the end of repositories:
Step 1
	dependencyResolutionManagement {
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}

 Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.paulo102121:Alerts:Tag'
	}
