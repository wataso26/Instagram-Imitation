package app.wataso_.watanabe.instagramimitation

class DataList (val name: String) {

    companion object {

        private var lastUserId = 0

        fun createUsersList(userCounts: Int) : ArrayList<DataList> {
            val users = ArrayList<DataList>()
            for (i in 1..userCounts) {
                users.add(
                        DataList(
                                "UserName_" + ++lastUserId
                        )
                )
            }
            return users
        }

    }

}