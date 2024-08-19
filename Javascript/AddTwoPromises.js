/**
 * @param {Promise} promise1
 * @param {Promise} promise2
 * @return {Promise}
 */
var addTwoPromises = async function (promise1, promise2) {      //O(max(promise1,promise2]))
    try {   //Promise.all() concurrently running all promises 
        const [res1, res2] = await Promise.all([promise1, promise2]);
        return res1 + res2;
    } catch (error) {
        console.error(error);
        throw error;
    }
};

var addTwoPromises_2 = async function (promise1, promise2) {      //leet code says: O(max(promise1,promise2])) but i think its O(promise1+promise2)
    try {      //awaiting the promises one after the other
        return await promise1 + await promise2;
    } catch (error) {
        console.error(error);
        throw error;
    }
};