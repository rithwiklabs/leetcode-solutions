impl Solution {
    pub fn can_alice_win(mut n: i32) -> bool {
        let mut rem: i32 = 10;
        let mut alice: bool = true;
        while(n>=rem)
        {
            n-=rem;
            rem-=1;
            alice=!alice
        }
        return !alice;
    }
}