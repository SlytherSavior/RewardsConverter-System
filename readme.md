# 💳 RewardsConverter System

![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![JUnit](https://img.shields.io/badge/JUnit-%23A020F0.svg?style=for-the-badge&logo=junit5&logoColor=white)
![Eclipse](https://img.shields.io/badge/Eclipse-2C2255?style=for-the-badge&logo=eclipse&logoColor=white)
![VS Code](https://img.shields.io/badge/VS_Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![Git](https://img.shields.io/badge/Git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

## Project Overview

This repository contains the backend implementation for the **RewardsConverter System**, developed as part of the **JPMorgan Chase SWE simulation** on Forage. The system handles the conversion of reward values between **cash** and **miles**.

### Features

- **Reward Conversion:** Convert between cash and airline miles using a conversion rate of **1 mile = $0.0035**.
- **RewardValue Class:** Implements constructors for both cash and miles values, enabling flexible reward calculations.
- **Test Coverage:** Includes unit tests to validate conversions between cash and miles.

### Project Structure

- `.git`
- `.gitignore`
- `pom.xml`
- `src`
  - `main`
    - `java`
       - `RewardValue.java`
  - `test`
    - `java`
       - `RewardValueTests.java`

### Future Enhancements

- **Currency Support:** Introduce support for additional reward types beyond cash and miles.
- **Optimization:** Improve the conversion efficiency by implementing caching techniques for repetitive conversions.
- **API Integration:** Add RESTful API endpoints to expose the reward conversion functionalities for broader use.

### Unit Testing

Unit tests ensure that the conversion between miles and cash operates as expected, covering edge cases and large value calculations.

## License

This project is licensed under the MIT License. See the [LICENSE](./LICENSE) file for more details.

### Acknowledgments

This project was developed as part of the **JPMorgan Chase SWE Simulation** on Forage. Special thanks to **JPMorgan Chase** and **Forage** for the opportunity.

## Contact

For any inquiries or contributions, please contact me via [LinkedIn](www.linkedin.com/in/slyther) or [email](mailto:shrijan5414@gmail.com) or [X/Twitter](https://x.com/SlytherShrijan).
