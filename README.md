# WayMoreOres

## BIG ANNOUNCEMENT

After almost a year of no updates, development has returned! I will start to release snapshots for 1.7 starting on the week of April 24th.

![Maintenance](https://img.shields.io/maintenance/yes/2023?style=for-the-badge)

![GitHub](https://img.shields.io/github/license/sidgames5/waymoreores?style=flat-square&logo=github)
![GitHub release (latest by date)](https://img.shields.io/github/v/release/sidgames5/waymoreores?display_name=tag&style=flat-square&logo=github)
![GitHub release (latest by date)](https://img.shields.io/github/v/release/sidgames5/waymoreores?display_name=tag&include_prereleases&style=flat-square&logo=github)

WayMoreOres is a utility mod that adds many new ores to Minecraft!

## Setup

1. Install IntelliJ IDEA or Eclipse (IDEA is recommended)
2. Install the java development kit (JDK) **version 17** (anything else wont work)
3. Download the code or clone the repository from GitHub
4. Open the terminal and navigate to the folder where the code is located
5. If you are using linux, run the following command: `chmod +x ./gradlew`
6. Run the following command: `./gradlew genSources`
7. Once you have completed all the steps, you can open the project in your favorite IDE.
8. If you are using IntelliJ, you can skip this step: Type `./gradlew <vscode|eclipse>` in the terminal.

## Testing

1. Open the terminal and navigate to the folder where the code is located
2. Run the following command: `./gradlew runClient`
3. Wait for the minecraft client to start

## Building

1. Open the terminal and navigate to the folder where the code is located
2. Run the following command: `./gradlew build`
3. Your compiled jar will be in the build/libs directory
