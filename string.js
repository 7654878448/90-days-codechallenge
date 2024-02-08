const name="sumit";
const id=101;
//console.log(name + id+ "value");
//it is outdated concept to concat two String;
//` `--->>>known As backticks..known String intapollasation 
// we make an placeholder it will help to perform many operation easily like to chnage upper case;
console.log(`HEllo my name is ${name}and my id is${id}`);
const keyvalueString=new String("sumit Sehgal");
//best way to create a String and it is easy to acess particular value because it store in key value pair
//like at 0 it is s at 1 u at 2 is m;;; 
console.log(keyvalueString[6]);
console.log(keyvalueString.__proto__);
//here we se the object here we use double underScore;
console.log(keyvalueString.length);//it will print length the string
console.log(keyvalueString.toLocaleUpperCase());//it is an method to change in upperCAse;

console.log(keyvalueString);
console.log(keyvalueString.indexOf('t'));
// it will check the string at which position it is located;
const newstring=keyvalueString.substring(0,3);
console.log(newstring);
const news ="   helloo darling";
console.log(news.trim());
//trim is used to remove the unwanted space in string ;
const url="https://heloooworld.com/sumit%20sehgal"
console.log(url.replace('%20','--'));
//it will help to replace the any thing at first parameter it will which string you want to change and second parameter it will take what new that replace the older one;
console.log(url.includes('hello'));
//it will help to check whether it is available or not;
console.log(newstring.split('-'));





