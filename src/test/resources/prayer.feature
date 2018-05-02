Feature: the prayer text can be retrieved
        Scenario: user chooses Wezwanie prayer for today (20 kwietnia)
        When user chooses 20 kwietnia in calendar
        And chooses Wezwanie
        Then the user receives status code of 200
        And the user receives proper text