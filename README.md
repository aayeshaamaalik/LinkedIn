
# LinkedIn System

This project implements a **LinkedIn-style social networking platform** using modular object-oriented design principles. It supports core features such as user profiles, experience tracking, connections, posts, and direct messaging between members.

**Design Reference:**  
This design is modeled on the [LinkedIn system from ycwkatie's OOD repository](https://github.com/ycwkatie/OOD-Object-Oriented-Design/blob/main/ood/linkedin.md).

---

## Key Components and Interacting Objects

| Class / Component              | Responsibility                                                             |
|--------------------------------|------------------------------------------------------------------------------|
| `Account`, `AccountStatus`     | Encapsulates login and membership status.                                  |
| `Member`, `Profile`            | Represents a LinkedIn user and their professional profile.                 |
| `Experience`, `Education`      | Captures job and academic history for profiles.                            |
| `Skill`, `Accomplishment`, `Recommendation` | Represent specific profile enhancements and peer endorsements.     |
| `Post`                         | Models public posts made by members.                                       |
| `Message`                      | Models private messages between members.                                   |
| `ConnectionInvitation`         | Manages connection requests between users.                                 |
| `ConnectionInvitationStatus`   | Enum to track the state of an invitation.                                  |

---

## Class Hierarchy and Design Structure

```
Account
   └── accountId
   └── password
   └── status (AccountStatus)

Member
   ├── Account
   ├── Profile
   ├── List<Integer> connections
   ├── sendMessage(), createPost(), sendConnectionInvitation()

Profile
   ├── String summary
   ├── List<Experience>
   ├── List<Education>
   ├── List<Skill>
   ├── List<Accomplishment>
   └── List<Recommendation>

Post
   ├── text
   ├── List<byte[]> images
   ├── List<byte[]> videos
   └── Date timestamp

Message
   ├── sendToMemberId
   ├── content
   └── timestamp

ConnectionInvitation
   ├── sendToMemberId
   ├── sentDate
   └── status (ConnectionInvitationStatus)
```

---

## Supported Functionalities

1. **User Registration & Account Management**  
   Users are created with credentials and an empty profile. They can reset passwords and manage account status.

2. **Profile Creation**  
   Users can build profiles with experience, education, skills, accomplishments, and receive recommendations.

3. **Posting and Sharing Content**  
   Users can create posts containing text, images, and videos.

4. **Messaging**  
   Members can send private messages to others.

5. **Connecting with Others**  
   Connection invitations can be sent, accepted, or rejected using the `ConnectionInvitation` system.

---

## Getting Started

To set up and run the project locally:

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/linkedin-system.git
   ```

2. Navigate into the project directory:
   ```bash
   cd linkedin-system
   ```

3. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).

4. Compile and run the system.  
   Ensure your environment supports **Java 8+**.

---

## Project Structure

| Package / Folder       | Responsibility                                         |
|------------------------|--------------------------------------------------------|
| `model/account`        | Contains `Account`, `AccountStatus`                    |
| `model/member`         | Contains `Member`, `Profile`, and all sub-profile classes |
| `model/social`         | Contains `Post`, `Message`, `ConnectionInvitation`     |
| `model/status`         | Contains `ConnectionInvitationStatus` enum             |

