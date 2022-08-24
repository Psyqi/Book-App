package com.fathi.recyclerview

object BookData {
    private val bookNames = arrayOf("A Brief History of Time",
        "Cinta Dalam 99 NamaMu",
        "Fiesta",
        "Gulag",
        "Homo Deus",
        "To Kill the Mockingbird",
        "21 Lessons for the 21st Century",
        "The Name of the Roses",
        "1984",
        "Perfect Valentine",
        "Pride and Prejudice",
        "I Want to Eat Your Pancreas")

    private val bookDetails = arrayOf("Books that try to answer big questions like: how did the universe start and what started it? What is time? Is it always moving forward?",
        "Arum and Alif are stuck on path that is far from lust, but in the end they love with all their souls. They believe that the end of the journey lies in His 99 names.",
        "Jake and his friends suddenly have to face various things that shake the comfort of their lives. It all started with the presence of Lady, an aristocratic woman",
        "The Gulags were hell for the people of the Soviet Union under Stalin's rule which was hidden from the eyes of the world, no one can escape it.",
        "Yuval Noah Harari's book describes the current human civilization as well as human civilization in the previous 100 years.",
        "Which tells the story and the heart of a young girl named Scout, against an environment that is still full of struggles and racism.",
        "Yuval Noah Harari through his book 21 Lessons for 21st Century discusses the most pressing global problems today.",
        "The Peace of the Benedictine Monastery Is Broken. A series of mysterious deaths left the monks in a state of horror.",
        "Tells about the time around 1984. Orwell described that period as a period of suffering. Each country is led by one party.",
        "Almost all the girls Echa knew liked to compliment Evan. They said Evan was polite, fun to talk to, and nice. But Echa couldn't see the side.",
        "Pride & Prejudice tells about the twists and turns of the love story experienced by a girl of noble descent named Elizabeth, Since its immediate success in 1813.",
        "I am a high school student. I found the diary of my classmate, Sakura Yamauchi, who turned out to be suffering from pancreatic cancer.")

    private val bookImages = intArrayOf(R.drawable.brief_history,
        R.drawable.cinta_namamu,
        R.drawable.fiesta,
        R.drawable.gulag,
        R.drawable.homo_deus,
        R.drawable.kill_mockingbird,
        R.drawable.lessons_century,
        R.drawable.name_roses,
        R.drawable.nineteen_eightyfour,
        R.drawable.perfect_valentine,
        R.drawable.pride_prejudice,
        R.drawable.your_pancreas)

    private val bookSummary = arrayOf("   In the ten years since its publication in 1988, Stephen Hawking's classic work has become a landmark volume in scientific writing, with more than nine million copies in forty languages sold worldwide. That edition was on the cutting edge of what was then known about the origins and nature of the universe.\n" +
                    "   But the intervening years have seen extraordinary advances in the technology of observing both the micro- and the macrocosmic worlds. These observations have confirmed many of Professor Hawking's theoretical predictions in the first edition of his book, including the recent discoveries of the Cosmic Background Explorer satellite (COBE), which probed back in time to within 300,000 years of the universe's beginning and revealed wrinkles in the fabric of space-time that he had projected.\n" +
                    "   Eager to bring to his original text the new knowledge revealed by these observations, as well as his own recent research, Professor Hawking has prepared a new introduction to the book, written an entirely new chapter on wormholes and time travel, and updated the chapters throughout.",
            "   Arum and Alif are caught in a path that is completely far from what they want but in the end they love with all their souls. Arum, who has struggled with death all his life, and Alif, who has been trapped in silence, gradually fall in love with the beautiful names of the Creator. Although life is like a long story with some unexpected plots, they believe that the end of the journey - lies in His 99 names.\n" +
                    "   This novel tells about the two main characters Arum and Alif. Their meeting was an unexpected one. At first, Arum hated Alif's attitude, the young man who accidentally bumped into Arum. Until finally he met again with the young man while in prison. Meanwhile, Alif is a naughty young man who always misses his long-lost mother. He admires and loves his mother very much.\n" +
                    "   Their relationship is closer to Asmaul Husna 99 names. Because without realizing it, they both admired the names so much that they always recited them. Their story is interesting and different, how there Arum and Alif really keep the boundaries of the relationship between men and women.",
            "   Jake—an American journalist—and his friends, who only intend to enjoy a vacation in Europe, suddenly have to face various things that shake the comfort of their lives. All of this begins with the presence of Lady Brett Ashley, an aristocratic woman who is beautiful, independent, but wild. Soon the woman's charm captivated Jake and his friends. However, it turns out that he gave Lady Brett's love to a handsome and young bullfighter.\n" +
                    "   Fiesta is Ernest Hemingway's first novel that proves his image as a genius writer while bringing him to the stage of the 20th century literary world. In this novel, Hemingway—who is indeed a rabid fan of bullfighting—skillsly weaves the symbolism of bull-man fighting into his character and life. these figures. In the midst of all-out parties and near-daily shows of death, they are challenged to defend the meaning of the pursuit of pleasure, the struggle for love, and what truly means to them.",
            "   The Gulag was hell for the people of the Soviet Union under Stalin's rule which was hidden from the eyes of the world. No one can escape it, including religious leaders, women, even children. In an agile and lively style of speech, sometimes satirical, Solzhenitsyn recounts arrest operations, forced labor camps, the mental and physical suffering of detainees, and people who have surprisingly strong moral courage in the face of persecution and torture, as well as life in exile.\n" +
                    "   Solzhenitsyn emphasizes the moral aspect of the issue he raises. Disclosure of cruelty and deceit by a ruling regime is not enough to be seen only as a political problem, but also a moral problem that leads the reader to basic questions about human nature itself: are humans inherently evil? Or is it good? And perhaps most importantly: why are humans so often unable to resist the evil that unfolds before their very eyes? Through this abridged version of The Gulag Archipelago, Solzhenitsyn once again proves that government power is indeed capable of carrying out various forms of cruelty to humans, physically and mentally, but can never completely extinguish the human spirit.",
            "   Yuval Noah Harari, author of the critically-acclaimed New York Times bestseller and international phenomenon Sapiens, returns with an equally original, compelling, and provocative book, turning his focus toward humanity’s future, and our quest to upgrade humans into gods. Over the past century humankind has managed to do the impossible and rein in famine, plague, and war. This may seem hard to accept, but, as Harari explains in his trademark style—thorough, yet riveting—famine, plague and war have been transformed from incomprehensible and uncontrollable forces of nature into manageable challenges.\n" +
                    "   For the first time ever, more people die from eating too much than from eating too little; more people die from old age than from infectious diseases; and more people commit suicide than are killed by soldiers, terrorists and criminals put together. The average American is a thousand times more likely to die from binging at McDonalds than from being blown up by Al Qaeda. What then will replace famine, plague, and war at the top of the human agenda? As the self-made gods of planet earth, what destinies will we set ourselves, and which quests will we undertake?\n" +
                    "   Homo Deus explores the projects, dreams and nightmares that will shape the twenty-first century—from overcoming death to creating artificial life. It asks the fundamental questions: Where do we go from here? And how will we protect this fragile world from our own destructive powers? This is the next stage of evolution. This is Homo Deus. With the same insight and clarity that made Sapiens an international hit and a New York Times bestseller, Harari maps out our future.",
            "   The unforgettable novel of a childhood in a sleepy Southern town and the crisis of conscience that rocked it. \"To Kill A Mockingbird\" became both an instant bestseller and a critical success when it was first published in 1960. It went on to win the Pulitzer Prize in 1961 and was later made into an Academy Award-winning film, also a classic.\n" +
                    "   Compassionate, dramatic, and deeply moving, \"To Kill A Mockingbird\" takes readers to the roots of human behavior - to innocence and experience, kindness and cruelty, love and hatred, humor and pathos. Now with over 18 million copies in print and translated into forty languages, this regional story by a young Alabama woman claims universal appeal. Harper Lee always considered her book to be a simple love story. Today it is regarded as a masterpiece of American literature.",
            "   How do computers and robots change the meaning of being human? How do we deal with the epidemic of fake news? Are nations and religions still relevant? What should we teach our children? Yuval Noah Harari's 21 Lessons for the 21st Century is a probing and visionary investigation into today's most urgent issues as we move into the uncharted territory of the future. As technology advances faster than our understanding of it, hacking becomes a tactic of war, and the world feels more polarized than ever, Harari addresses the challenge of navigating life in the face of constant and disorienting change and raises the important questions we need to ask ourselves in order to survive.\n" +
                    "   In twenty-one accessible chapters that are both provocative and profound, Harari builds on the ideas explored in his previous books, untangling political, technological, social, and existential issues and offering advice on how to prepare for a very different future from the world we now live in: How can we retain freedom of choice when Big Data is watching us? What will the future workforce look like, and how should we ready ourselves for it? How should we deal with the threat of terrorism? Why is liberal democracy in crisis?",
            "   The year is 1327. Benedictines in a wealthy Italian abbey are suspected of heresy, and Brother William of Baskerville arrives to investigate. When his delicate mission is suddenly overshadowed by seven bizarre deaths, Brother William turns detective. His tools are the logic of Aristotle, the theology of Aquinas, the empirical insights of Roger Bacon—all sharpened to a glistening edge by wry humor and a ferocious curiosity. He collects evidence, deciphers secret symbols and coded manuscripts, and digs into the eerie labyrinth of the abbey, where \"the most interesting things happen at night.\"",
            "   The new novel by George Orwell is the major work towards which all his previous writing has pointed. Critics have hailed it as his \"most solid, most brilliant\" work. Though the story of Nineteen Eighty-Four takes place thirty-five years hence, it is in every sense timely. The scene is London, where there has been no new housing since 1950 and where the city-wide slums are called Victory Mansions. Science has abandoned Man for the State. As every citizen knows only too well, war is peace.\n" +
                    "   To Winston Smith, a young man who works in the Ministry of Truth (Minitru for short), come two people who transform this life completely. One is Julia, whom he meets after she hands him a slip reading, \"I love you.\" The other is O'Brien, who tells him, \"We shall meet in the place where there is no darkness.\" The way in which Winston is betrayed by the one and, against his own desires and instincts, ultimately betrays the other, makes a story of mounting drama and suspense.",
            "Once in the park, Echa closed her eyes and took a deep breath. A sweet smile widens here.\n" +
                    "\"Why, Cha? Shooting a commercial? Why do you pose like that?\" Echa's eyes immediately opened at the very familiar voice. With a sneer, Echa glanced at Evan who at some point was in front of her.\n" +
                    "\"You again, you again. Why do you always appear near me? Are you a fan of me? Can't you just stay with me for a while?\"\n" +
                    "\"I have a radar for weirdos, Cha.\"\n" +
                    "\"What do you mean, I'm such a weirdo?\"\n" +
                    "\"Do you think it's weird if you brake incoherently when all the other kids are busy lifting things?\"\n" +
                    "Throughout her high school days, Echa had once hated someone like her yet hated Evan. Since the beginning of the meeting, Evan incessantly interfered with his life. Because of that, Echa was confused to death when suddenly Evan expressed love through poetry.\n" +
                    "However, when Echa realizes that she also likes Evan, it turns out that Evan is just one of the guy's tricks to interfere with Echa's life... ",
            "   Since its immediate success in 1813, Pride and Prejudice has remained one of the most popular novels in the English language. Jane Austen called this brilliant work \"her own darling child\" and its vivacious heroine, Elizabeth Bennet, \"as delightful a creature as ever appeared in print.\" The romantic clash between the opinionated Elizabeth and her proud beau, Mr. Darcy, is a splendid performance of civilized sparring. And Jane Austen's radiant wit sparkles as her characters dance a delicate quadrille of flirtation and intrigue, making this book the most superb comedy of manners of Regency England.",
            "   Spent time with Sakura before she died. 12 years later, because of Sakura's words, I became a teacher at my alma mater.\n" +
                    "   In this deeply moving first-person story, an introverted high school boy finds his classmate’s diary―and learns her biggest secret. Yamauchi Sakura is dying from a pancreatic disease and now he is the only one person outside her family to know the truth. The last thing the boy wants is to be her friend, but Sakura’s cheerful demeanor and their shared secret draw them together in this heartrending tale of friendship and mortality.",)

    private val bookWriters = arrayOf("by Stephen Hawking",
            "by Asma Nadia",
            "by Ernest Hemingway",
            "by Aleksandr Solzhenitsyn",
            "by Yuval Noah Harari",
            "by Harper Lee",
            "by Yuval Noah Harari",
            "by Umberto Eco",
            "by George Orwell",
            "by Erlin Cahyadi",
            "by Jane Austen",
            "by Sumino Yoru")

    private val bookCreators = arrayOf("Stephen Hawking",
            "Asma Nadia",
            "Ernest Hemingway",
            "Aleksandr Solzhenitsyn",
            "Yuval Noah Harari",
            "Harper Lee",
            "Yuval Noah Harari",
            "Umberto Eco",
            "George Orwell",
            "Erlin Cahyadi",
            "Jane Austen",
            "Sumino Yoru")

    private val writerImages = intArrayOf(R.drawable.hawking,
            R.drawable.asma,
            R.drawable.ernest,
            R.drawable.aleksandr,
            R.drawable.yuval,
            R.drawable.harper,
            R.drawable.yuval,
            R.drawable.eco,
            R.drawable.orwell,
            R.drawable.unknown,
            R.drawable.jane,
            R.drawable.unknown)

    val listData: ArrayList<Book>
        get() {
            val list = arrayListOf<Book>()
            for (position in bookNames.indices) {
                val book = Book()
                book.title = bookNames[position]
                book.detail = bookDetails[position]
                book.psd = bookImages[position]
                book.summary = bookSummary[position]
                book.write = bookWriters[position]
                book.create = bookCreators[position]
                book.image = writerImages[position]
                list.add(book)
            }
            return list
        }
}
