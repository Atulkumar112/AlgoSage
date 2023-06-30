/**
 * @param {number} millis
 */
async function sleep(millis) {
    await new Promise(resolved => setTimeout(resolved, millis));
}

/** 
 * let t = Date.now()
 * sleep(100).then(() => console.log(Date.now() - t)) // 100
*/

// youtube video link 
// https://youtu.be/pH-VlNvnoEM
