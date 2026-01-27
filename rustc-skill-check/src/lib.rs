use proc_macro::TokenStream;
use std::process::{Command, Stdio};

#[proc_macro]
pub fn skill_check(tokens: TokenStream) -> TokenStream {
    let output = Command::new("./runner.sh").stdout(Stdio::inherit()).stderr(Stdio::inherit()).output().expect("failed to run gradlew");
    if let Some(code) = output.status.code() {
        println!("Gradlew exited with code {}", code);
    }
    else {
        println!("Gradlew exited by signal!");
    }
    return tokens;
}